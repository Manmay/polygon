var polygon = angular.module('polygon', ['ngRoute']);

polygon.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/products', {
            'templateUrl': '/html/products.html',
            'controller': 'productsCtrl'
        }).when('/products/:id/questionnaires', {
            'templateUrl': '/html/questionnaires.html',
            'controller': 'questionnairesCtrl'
        })
        .otherwise({
        	redirectTo: '/products'
        });
}]);



polygon.controller('productsCtrl', function ($scope, $rootScope, $http) {
     
    $scope.init = function(){
        $scope.getProducts();
    };

    $scope.getProducts = function () {
        console.log('get products');
        $http({
            url: '/api/products',
            method: 'get'
        }).success(function (data, status) {
            if (status == 200) {
                console.log('retrived successfully');
                $rootScope.products = data;
            } else {
                console.log('status:' + status);
                $rootScope.error = "error status code : " + status;;
            }
        }).error(function (error) {
            console.log(error);
        	$rootScope.error = error;;
                
        });
    };
});


polygon.controller('questionnairesCtrl', function ($scope, $rootScope, $http, $routeParams) {
	
	console.log($routeParams['id']);
	console.log($rootScope.products);
	

});
