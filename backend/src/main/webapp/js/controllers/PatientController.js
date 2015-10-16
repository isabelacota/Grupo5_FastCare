app.controller('PatientController', ['$scope', 'patientService', function($scope, patientService) {
  
  $scope.patient = {};
  
  $scope.insertPatient = function(patient) {
	  patientService.insert(patient).success(function(patient) {
		  $scope.patient = patient;
	  })
	  .error(function(err) {
		  
	  }); 
  };
}]);