app.controller('FilterPatientController', ['$scope', 'patientService', function($scope, patientService) {

  $scope.patients = [];
  $scope.filter = '';
  $scope.fail = false;

  $scope.filterPatients = function(filter) {
      $scope.fail = false;
      $scope.patients = [];
      patientService.filter(filter).success(function(response) {
          if (response.statusId == 0) {
              $scope.patients = response.patients;
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