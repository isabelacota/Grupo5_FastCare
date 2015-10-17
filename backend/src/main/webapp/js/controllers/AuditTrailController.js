app.controller('AuditTrailController', ['$scope', 'auditTrailService', function($scope, auditService) {

  $scope.success = false;
  $scope.fail = false;
  $scope.records = auditService.getRecords();
  
//  $scope.insertPatient = function(patient) {
//      $scope.success = false;
//      $scope.fail = false;
//	  patientService.insert(patient).success(function(response) {
//          if (response.statusId == 0) {
//              $scope.patient = {};
//              $scope.success = true;
//          } else {
//              $scope.fail = true;
//              $scope.errorMessage = response.statusMessage;
//          }
//	  })
//	  .error(function(err) {
//          $scope.fail = true;
//          $scope.errorMessage = err;
//	  });
//  };
}]);