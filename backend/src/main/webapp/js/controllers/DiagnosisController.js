app.controller('DiagnosisController', ['$scope', 'soapeService', function($scope, soapeService) {

  $scope.diagnosis = {appointmentId : 1};
  $scope.success = false;
  $scope.fail = false;

  $scope.insertDiagnosis = function(diagnosis) {
      $scope.success = false;
      $scope.fail = false;
      console.log(diagnosis);
      diagnosis.appointmentId = new Date().getTime();
	  soapeService.insertDiagnosis(diagnosis).success(function(response) {
          if (response.statusId == 0) {
              $scope.diagnosis = {};
              $scope.success = true;
          } else {
              $scope.fail = true;
              console.log(response);
              $scope.errorMessage = response.statusMessage;
          }
	  })
	  .error(function(err) {
          $scope.fail = true;
          $scope.errorMessage = err;
	  });
  };
}]);
