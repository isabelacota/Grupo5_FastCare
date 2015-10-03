/*

 * Nesse arquivo estamos configurando variáveis e métodos GLOBAIS

 */

SERVER_URL="http://localhost:8080/hellojersey/rest";

//criando o module para toda app

       $app = angular.module('app',[]);

//criando a routes
//       $app.config(function($routeProvider,$httpProvider,$locationProvider){
//                           //definindo as rotas
//             $routeProvider.
//             when('/',{templateUrl:'view/customers.html',controller:customerController}).
//             when('/clientes',{templateUrl:'view/hello.html',controller:customerController}).
//              otherwise({redirectTo:'/'});
//
//       $httpProvider.responseInterceptors.push(function($q,$rootScope){
//
//             return function(promise){
//
//                    return promise.then(function(response){
//
//                           return (response);
//
//                    },function(response){
//
//                           $data = response.data;
//
//                           $error = $data.error;
//
////                  coloquei os alerts para me certificar que a função foi chamada
//
//                           if($error && $error.text)
//
//                                  alert("ERROR: " + $error.text);
//
//                           else{
//
//                                  if(response.status=404)
//
//                                  alert("Page not found");
//
//                           }
//
//                           return $q.reject(response);
//
//                    });
//
//             };
//
//       });
//
//});

        $app.run(function($rootScope){
                $rootScope.ola = "nick";
                $rootScope.server=function(url){
                        alert(SERVER_URL + url);
                        return SERVER_URL + url;
                };

        }

);