app.controller('PatientController', ['$scope', 'patientService', function($scope, patientService) {
  
  $scope.patient = {};
  $scope.success = false;
  $scope.fail = false;
  
  $scope.insertPatient = function(patient) {
      $scope.success = false;
      $scope.fail = false;
	  patientService.insert(patient).success(function(response) {
          if (response.statusId == 0) {
              $scope.patient = {};
              $scope.success = true;
          } else {
              $scope.fail = true;
              $scope.errorMessage = response.statusMessage;
          }
	  })
	  .error(function(err) {
		  
	  }); 
  };
}]);