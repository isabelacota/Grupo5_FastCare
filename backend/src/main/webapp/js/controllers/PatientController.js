app.controller('PatientController', ['$scope', 'patientservice', function($scope, patientservice) {
  patientservice.success(function(data) {
    $scope.fiveDay = data;
  });
}]);