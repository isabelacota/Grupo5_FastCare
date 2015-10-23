app.factory('auditTrailService', ['$http', function($http) {

    var getAudits = function() {
		return $http.get('./API/audit')
		.success(function(data) {
			return data.audits;
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
		getAudits: getAudits
	};
}]);
