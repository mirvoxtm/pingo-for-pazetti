//main.js
document.body.addEventListener('htmx:afterOnLoad', function(event) {
    if (event.detail.elt === document.getElementById('findingRandomSixteen')) {
        var data = JSON.parse(event.detail.xhr.responseText);
        console.log(data);
        
        var strings = data.map(function(item) {
            console.log(strings);
            
            return '<div class="aspect-square flex items-center drop-shadow-md justify-center bg-zinc-200 rounded-md transition duration-300 ease-in-out hover:bg-yellow-500 hover:text-slate-50" onclick="changeColor(this)">' + '<b>' + '<span class="m-1 sm:text-sm">' + item.strings + '</span>' + ' </b>' + '</div>';
        });
        document.querySelector('#findingRandomSixteen').innerHTML = strings.join('');
        console.log(strings.join(''));
    }
});

function changeColor(element) {
    if (element.classList.contains('bg-green-500')) {
        element.classList.remove('bg-green-500', 'text-white', 'hover:bg-yellow-500');
        element.classList.add('bg-zinc-200', 'text-black', 'hover:bg-yellow-500');
    } else {
        element.classList.remove('bg-zinc-200', 'text-black', 'hover:bg-yellow-500');
        element.classList.add('bg-green-500', 'text-slate-50');
    }
}