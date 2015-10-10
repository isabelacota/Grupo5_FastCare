app.controller('PatientController', ['$scope', 'insertPatientService','patientservice', function($scope, insertPatientService,patientservice) {
  patientservice.success(function(data) {
    $scope.fiveDay = data;
  });
  
  $scope.patient = {};
  
  $scope.insertPatient = function(patient) {
	  debugger;
	  insertPatientService.insert(patient).success(function(patient) {
		  $scope.patient = p;
	  })
	  .error(function(err) {
		  
	  }); 
  };
}]);