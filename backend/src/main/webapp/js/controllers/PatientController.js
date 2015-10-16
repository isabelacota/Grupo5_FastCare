app.controller('PatientController', ['$scope', 'patientService', function($scope, patientService) {
  
  $scope.patient = {};
  
  $scope.insertPatient = function(patient) {
	  debugger;
	  patientService.insert(patient).success(function(patient) {
		  $scope.patient = patient;
	  })
	  .error(function(err) {
		  
	  }); 
  };
}]);