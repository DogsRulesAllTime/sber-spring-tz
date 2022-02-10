// alert("js is working")
$(document).ready(function() {
    $("#form").submit(function (e) {
        e.preventDefault();
        let var1 = parseInt($("#input1").val());
        let var2 = parseInt($("#input2").val());
        let var3 = $("#login").val();
        let var4 = $("#pass").val();
        //check input type
        // if (isNaN(var1) || isNaN(var2)){
        //     alert('все поля должны содержать type(number)');
        // }else {
        //     alert(var1 + typeof (var1) + " " + var2 + typeof (var2));
            let output = undefined;
            (async () => {
                const rawResponse = await fetch('http://localhost:8080/api/summ', {
                    method: 'POST',
                    headers: {
                        'Accept': 'application/json',
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify({
                        firstNumber: var1,
                        secondNumber: var2,
                        inputLogin: var3,
                        inputPassword: var4
                    })
                });
                const content = await rawResponse.json();
                if (content === 404){
                    output = "Вы не прошли авторизацию";
                }else {
                    output = content;
                }
                console.log(content);
                // alert(output);
                $('#answer').html(output);
            })();
    });
    //apecharts
    let options = {
        series: [{
            data: [100, 220, 150, 300, 350, 450, 500, 300] //
        }],
        chart: {
            type: 'bar',
            height: 260 //
        },
        plotOptions: {
            bar: {
                borderRadius: 4,
                horizontal: true,
            }
        },
        dataLabels: {
            enabled: false
        },
        xaxis: {
            categories: ['South Korea', 'Canada', 'United Kingdom', 'Netherlands', 'Italy', 'France', 'Japan',
                'United States', 'China', 'Germany'
            ],
        }
    };

    let chart = new ApexCharts(document.querySelector("#chart"), options);
    chart.render();
});