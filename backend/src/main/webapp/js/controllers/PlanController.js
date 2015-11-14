app.controller('PlanController', ['$scope', 'soapeService', function($scope, soapeService) {

  $scope.plan = {appointmentId : 1};
  $scope.success = false;
  $scope.fail = false;

  $scope.insertPlan = function(plan) {
      $scope.success = false;
      $scope.fail = false;
      console.log(plan);
	  soapeService.insertPlan(plan).success(function(response) {
          if (response.statusId == 0) {
              $scope.plan = {};
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
