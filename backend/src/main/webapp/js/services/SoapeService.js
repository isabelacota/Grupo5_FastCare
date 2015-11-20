app.factory('soapeService', ['$http', function($http, soapeInfo) {

	var insertSubjective = function(subjectiveInfo) {
		return $http.post('./API/appointment/'+subjectiveInfo.appointmentId+'/subjective', {
			appointmentId: subjectiveInfo.appointmentId,
            mainComplaint: subjectiveInfo.mainComplaint,
            story: subjectiveInfo.story,
            syptomaticInterrogation: subjectiveInfo.syptomaticInterrogation,
            personalAndFamily: subjectiveInfo.personalAndFamily,
            lifeStyleAndSocioeconomic: subjectiveInfo.lifeStyleAndSocioeconomic,
            orthoticsAndProsthetics: subjectiveInfo.orthoticsAndProsthetics,
            comments: subjectiveInfo.comments
			});
	};

	var getSubjective = function(appointmentId) {
	    return $http.get('./API/appointment/'+appointmentId+'/subjective')
            .success(function(response) {
                return response.patients;
            })
            .error(function(err) {
                    return err;
            });
    	};

	var insertObjective = function(objectiveInfo) {
    		return $http.post('./API/appointment/'+objectiveInfo.appointmentId+'/objective', {
    			height: objectiveInfo.height,
                weight: objectiveInfo.weight,
                cardiacFrequency: objectiveInfo.cardiacFrequency,
                systolicArterialPressure: objectiveInfo.systolicArterialPressure,
                diastolicArterialPressure: objectiveInfo.diastolicArterialPressure,
                oxigenSaturation: objectiveInfo.oxigenSaturation,
                carbonicSaturation: objectiveInfo.carbonicSaturation,
                capilarGlycemy: objectiveInfo.capilarGlycemy,
                observations: objectiveInfo.observations
            });
    	};

	var getObjective = function(appointmentId) {
        return $http.get('./API/appointment/'+appointmentId+'/objective');
    }

    var insertDiagnosis = function(patientInfo) {
            return $http.post('./API/appointment/'+patientInfo.appointmentId+'/diagnosis', {
                diagnosis: patientInfo.diagnosis,
                observations: patientInfo.comments,
                permanent: patientInfo.permanent
            });
        };

    var getDiagnosis = function(appointmentId) {
        return $http.get('./API/appointment/'+appointmentId+'/diagnosis/');
    };

    var insertEvolution = function(patientInfo) {
                return $http.post('./API/appointment/'+patientInfo.appointmentId+'/evolution', {
                    evolution: patientInfo.evolution
                });
            };

    var insertPlan = function(patientInfo) {
                    return $http.post('./API/appointment/'+patientInfo.appointmentId+'/plan', {
                        conduct: patientInfo.conduct,
                        comments: patientInfo.comments
                    });
                };

    return {
		insertSubjective: insertSubjective,
		insertObjective: insertObjective,
		insertEvolution: insertEvolution,
		insertPlan: insertPlan,
		insertDiagnosis: insertDiagnosis,
		getSubjective: getSubjective,
		getObjective: getObjective
	};
}]);
