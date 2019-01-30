app.service("learningService", function(){
	
	var service = this;
	
	service.saveUser = function(formData) {
        return $http.post("/savename", formData);
    }
	
})