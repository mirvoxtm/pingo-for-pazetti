//transparency.js
document.body.addEventListener('htmx:afterOnLoad', function(event) {
        if (event.detail.elt === document.getElementById('listAll')) {
            var data = JSON.parse(event.detail.xhr.responseText);
            console.log(data);
            
            var strings = data.map(function(item) {
				console.log(strings);
				
                return '<div class="aspect-square flex items-center drop-shadow-md justify-center bg-zinc-200 rounded-md transition duration-300 ease-in-out hover:bg-yellow-500 hover:text-slate-50">' + '<b>' + '<span class="m-1 sm:text-sm">' + item.strings + '</span>' + ' </b>' + '</div>';
            });
            document.querySelector('#listAll').innerHTML = strings.join('');
            console.log(strings.join(''));
        	}
   		 });
   		 
document.body.addEventListener('htmx:afterOnLoad', function(event) {
         if (event.detail.elt === document.getElementById('findingRandom')) {
              var data = JSON.parse(event.detail.xhr.responseText);
              var strings = data.strings;
              document.getElementById('findingRandom').textContent = strings;
         }
   });
   		 
    	document.body.addEventListener('htmx:afterOnLoad', function(event) {
        if (event.detail.elt === document.getElementById('findingRandomSixteen')) {
            var data = JSON.parse(event.detail.xhr.responseText);
            console.log(data);
            
            var strings = data.map(function(item) {
				console.log(strings);
				
                return '<div class="aspect-square flex items-center drop-shadow-md justify-center bg-zinc-200 rounded-md transition duration-300 ease-in-out hover:bg-yellow-500 hover:text-slate-50">' + '<b>' + '<span class="m-1 sm:text-sm">' + item.strings + '</span>' + ' </b>' + '</div>';
            });
            document.querySelector('#findingRandomSixteen').innerHTML = strings.join('');
            console.log(strings.join(''));
        	}
   		 });
   		 
 		var div = document.getElementById("buttondiv");
		var dialog = document.getElementById("dialog");
		var overlay = document.getElementById("overlay");

		div.addEventListener("click", function() {
 		 dialog.showModal();
  		overlay.style.display = "block";
		});

		window.addEventListener("click", function(event) {
  		if (event.target == dialog) {
    		dialog.close();
   		 	overlay.style.display = "none";
  		}
		});