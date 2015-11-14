app.controller('EvolutionController', ['$scope', 'soapeService', function($scope, soapeService) {

  $scope.evolution = {appointmentId : 1};
  $scope.success = false;
  $scope.fail = false;

  $scope.insertEvolution = function(evolution) {
      $scope.success = false;
      $scope.fail = false;
      console.log(evolution);
	  soapeService.insertEvolution(evolution).success(function(response) {
          if (response.statusId == 0) {
              $scope.evolution = {};
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
