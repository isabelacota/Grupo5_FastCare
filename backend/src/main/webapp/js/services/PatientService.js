app.factory('oldPatientservice', ['$http', function($http) {
  return $http.get('http://bla:8080/FastCare/API/patient/1')
            .success(function(data) {
              return data;
            })
            .error(function(err) {
              return err;
            });
}]);

app.factory('patientService', ['$http', function($http, patient) {
	var insertPatient = function(patient) {
		return $http.post('./API/patient/insert', {
			name: patient.name,
			cpf: patient.cpf,
			//birthDate: patient.birthDate,
			gender: patient.gender,
			phone: patient.phone,
			healthPlan: patient.healthPlan})
		.success(function(data) {
				return data.patient;
		})
		.error(function(err) {
				return err;
		});
	};

	var filterPatients = function(filter) {
	    var url = './API/patient/filter?filter=' + filter;

	    return $http.get(url)
	        .success(function(response) {
	            return response.patients;
	        })
	        .error(function(err) {
	                return err;
	        });
	};
	
	return {
		insert: insertPatient,
		filter: filterPatients
	};
}]);
