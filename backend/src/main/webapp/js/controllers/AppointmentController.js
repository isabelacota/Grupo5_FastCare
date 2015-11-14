app.controller('AppointmentController', ['$scope', 'soapeService', function($scope, soapeService) {

  $scope.appointment = {appointmentId : 1};
  $scope.success = false;
  $scope.fail = false;

  $scope.insertAppointment = function(appointment) {
      $scope.success = false;
      $scope.fail = false;
      console.log(appointment);
	  soapeService.insertAppointment(appointment).success(function(response) {
          if (response.statusId == 0) {
              $scope.appointment = {};
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
