app.controller('FilterPatientController', ['$scope', 'patientService', function($scope, patientService) {

  $scope.patients = [];
  $scope.filter = 'bla';

  $scope.filterPatients = function(filter) {
      debugger;
      patientService.filterPatients(filter).success(function(patients) {
          $scope.patients = patients;
      })
      .error(function(err) {

      });
  };
}]);