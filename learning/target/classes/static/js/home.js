var app = angular.module("learningApp",[]);

app.controller("learningCtrl",["$scope","$http",function($scope,$http){
	
	var vm = this;
	
	$scope.data = {
			"name" : ""
		};
	
	vm.sendit = function(){
		console.log("Your are hree")
		
		var config = {
	            headers : {
	                'Content-Type': 'application/json;'
	            }
	        }

	        $http.post('/save', $scope.data, config)
	        .success(function (data, status, headers, config) {
	            $scope.data = data;
	        })
	        .error(function (data, status, header, config) {
	            $scope.ResponseDetails = "Data: " + data +
	                "<hr />status: " + status +
	                "<hr />headers: " + header +
	                "<hr />config: " + config;
	        });
		
		
	}
	
	
	
	
	
}]);