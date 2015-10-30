app.controller('AuditTrailController', ['$scope', 'auditTrailService', function($scope, auditService) {
    
    $scope.success = false;
    $scope.fail = false;
    auditService.getAudits().success(function(response) {
	console.log(response.audits);
	$scope.audits = response.audits;
    });
}]);
