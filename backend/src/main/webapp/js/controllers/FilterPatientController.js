app.controller('FilterPatientController', ['$scope', 'patientService', function($scope, patientService) {

  $scope.patients = [];
  $scope.filter = '';

  $scope.filterPatients = function(filter) {
      patientService.filter(filter).success(function(response) {
          $scope.patients = response.patients;
      })
      .error(function(err) {

      });
  };
}]);