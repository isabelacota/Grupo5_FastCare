app.factory('patientservice', ['$http', function($http) {
  return $http.get('http://localhost:8080/FastCare/API/patient/1')
            .success(function(data) {
              return data;
            })
            .error(function(err) {
              return err;
            });
}]);