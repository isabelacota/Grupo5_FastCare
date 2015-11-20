app.controller('SubjectiveController', ['$scope', 'soapeService', function($scope, soapeService) {

  $scope.appointmentId = new Date().getTime();
  $scope.subjective = {appointmentId : $scope.appointmentId};
  $scope.success = false;
  $scope.fail = false;
  
  $scope.insertSubjective = function(subjective) {
      $scope.success = false;
      $scope.fail = false;
      console.log(subjective);
      subjective.appointmentId = new Date().getTime();
	  soapeService.insertSubjective(subjective).success(function(response) {
          if (response.statusId == 0) {
              $scope.subjective = {};
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