app.controller('ObjectiveController', ['$scope', 'soapeService', function($scope, soapeService) {
  
  $scope.object = {appointmentId : 1};
  $scope.success = false;
  $scope.fail = false;
  
  $scope.insert = function(object) {
      $scope.success = false;
      $scope.fail = false;
          console.log(object);
	  soapeService.insertObjective(object).success(function(response) {
          if (response.statusId == 0) {
              $scope.object = {};
              $scope.success = true;
          } else {
              $scope.fail = true;
              $scope.errorMessage = response.statusMessage;
          }
	  })
	  .error(function(err) {
          $scope.fail = true;
          $scope.errorMessage = err;
	  });
  };
}]);