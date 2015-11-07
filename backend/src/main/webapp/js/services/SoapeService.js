app.factory('soapeService', ['$http', function($http, soapeInfo) {

	var insertSubjective = function(subjectiveInfo) {
		return $http.post('./API/patient/'+subjectiveInfo.patientId+'/subjective', {
			appointmentId: subjectiveInfo.appointmentId,
            mainComplaint: subjectiveInfo.mainComplaint,
            story: subjectiveInfo.story,
            renal: subjectiveInfo.renal,
            reumatism: subjectiveInfo.reumatism,
            cardiac: subjectiveInfo.cardiac,
            pulmonar: subjectiveInfo.pulmonar,
            gastric: subjectiveInfo.gastric,
            alergies: subjectiveInfo.alergies,
            hepatite: subjectiveInfo.hepatite,
            pregnancy: subjectiveInfo.pregnancy,
            diabetes: subjectiveInfo.diabetes,
            scars: subjectiveInfo.scars,
            onDrugs: subjectiveInfo.onDrugs
			});
	};

	var getSubjective = function(patientId, appointmentId) {
	    return $http.get('./API/patient/'+patientId+'/subjective')
            .success(function(response) {
                return response.patients;
            })
            .error(function(err) {
                    return err;
            });
    	};

	var insertObjective = function(objectiveInfo) {
    		return $http.post('./API/patient/'+objectiveInfo.patientId+'/objective', {
    			height: objectiveInfo.height,
                weight: objectiveInfo.weight,
                cardiacFrequency: objectiveInfo.cardiacFrequency,
                systolicArterialPressure: objectiveInfo.systolicArterialPressure,
                diastolicArterialPressure: objectiveInfo.diastolicArterialPressure,
                observations: objectiveInfo.observations
            });
    	};
	}

	var getObjective = function(patientId, appointmentId) {
        return $http.get('./API/patient/'+patientId+'/objective');
    }

    var insertDiagnosis = function(patientInfo) {
            return $http.post('./API/patient/'+patientInfo.patientId+'/diagnosis', {
                diagnosis: patientInfo.diagnosis,
                weight: patientInfo.observations
            });
        };
    }

    var getDiagnosis = function(patientId, appointmentId) {
        return $http.get('./API/patient/'+patientId+'/diagnosis/');
    }

    return {
		insertSubjective: insertSubjective,
		insertObjective: insertObjective,
		getSubjective: getSubjective,
		getObjective: getObjective
	};
}]);
