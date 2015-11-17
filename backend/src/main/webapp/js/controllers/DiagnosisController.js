app.controller('DiagnosisController', ['$scope', 'soapeService', function($scope, soapeService) {

  $scope.diagnosis = {appointmentId : 1};
  $scope.diagnosis.diagnosis = [];
  $scope.diagnosis.diagnosisString = "";
  $scope.success = false;
  $scope.fail = false;
  $scope.diagnosisField = "";

  $scope.getDiagnosis = function(viewValue) {
    return ["J12 - Pneumonia viral não classificada em outra parte","J120 - Pneumonia devida a adenovírus","J121 - Pneumonia devida a vírus respiratório sincicial","J122 - Pneumonia devida à parainfluenza","J128 - Outras pneumonias virais","J129 - Pneumonia viral não especificada"];
  };
  $scope.$watch('diagnosisField', function() {
    console.log($scope.diagnosisField);
  });
  $scope.enterPressed = function() {
    if(!$scope.diagnosisField == "") {
            $scope.diagnosis.diagnosis.push($scope.diagnosisField);
            $scope.diagnosisString = $scope.diagnosis.diagnosis.toString();
            $scope.diagnosisField = "";
            console.log($scope.diagnosisString);
         }
     };

  $scope.insertDiagnosis = function(diagnosis) {
      $scope.success = false;
      $scope.fail = false;
      if(diagnosis.diagnosis) {
        diagnosis.diagnosis = diagnosis.diagnosis.split(",")
      }
      console.log(diagnosis);
	  soapeService.insertDiagnosis(diagnosis).success(function(response) {
          if (response.statusId == 0) {
              $scope.diagnosis = {};
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
