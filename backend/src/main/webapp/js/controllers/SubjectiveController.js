app.controller('SubjectiveController', ['$scope', 'soapeService', function($scope, soapeService) {
  
  $scope.subjective = {appointmentId : 1};
  $scope.success = false;
  $scope.fail = false;
  
  $scope.insertSubjective = function(subjective) {
      $scope.success = false;
      $scope.fail = false;
      console.log(subjective);
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

//  $scope.getSubjective = function(appointmentId) {
//        $scope.fail = false;
//        $scope.patients = [];
//        soapeService.getSubjective(appointmentId).success(function(response) {
//            if (response.statusId == 0) {
//                $scope.patients = response.patients;
//            } else {
//                $scope.fail = true;
//                $scope.errorMessage = response.statusMessage;
//            }
//        })
//        .error(function(err) {
//            $scope.fail = true;
//            $scope.errorMessage = err;
//        });
//    };
}]);