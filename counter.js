document.addEventListener('DOMContentLoaded',function(){

    const start = document.getElementById('btn');
    const count = document.getElementById('count');
    const stop = document.getElementsByClassName('hide');
    start.addEventListener('click',function(){
        count.style.display = 'inline';
        
        
       for(let i = 3; i>=0;i--){
            
            setInterval(() => {
                console.log(i);
                count.innerHTML= i;
            }, 1000);
       }

        let increment = document.getElementById('increment');
        let decrement = document.getElementById('decrement');
        let cou = 0;

        function increse(){

            cou +=1;
            document.getElementById('countdown').innerHTML = cou;
        }

        function decrese(){

            cou-=1;
            document.getElementById('countdown').innerHTML = cou;
        }

        increment.addEventListener('click',increse);
        decrement.addEventListener('click',decrese)
        
       
        

    })
});

