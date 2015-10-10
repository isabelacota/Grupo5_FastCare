app.factory('patientservice', ['$http', function($http) {
  return $http.get('http://bla:8080/FastCare/API/patient/1')
            .success(function(data) {
              return data;
            })
            .error(function(err) {
              return err;
            });
}]);

app.factory('insertPatientService', ['$http', function($http, patient) {
	var insertPatient = function(patient) {
		return $http.post('./API/patient', {
			name: patient.name,
			cpf: patient.cpf,
			birthDate: patient.birthDate,
			gender: patient.gender,
			phone: patient.phone})
		.success(function(data) {
				return data.P;
		})
		.error(function(err) {
				return err;
		});
	};
	
	return {
		insert: insertPatient
	};
}]);
