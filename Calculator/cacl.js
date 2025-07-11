document.addEventListener('keydown', function(event) {
    const key = event.key;

    // Check if the key is a number or an operator
    if ((key >= '0' && key <= '9') || ['+', '-', '*', '/'].includes(key)) {
        appendToDisplay(key);
    }

    // Check for Enter key to calculate
    if (key === 'Enter') {
        calculate();
    }

    // Check for Escape key to clear
    if (key === 'Escape') {
        toClr();
    }
});


const display = document.getElementById('display');
function appendToDisplay(input){
display.value += input;
}
function toClr(){
display.value="";
}
function calculate(){
    try{
        display.value = eval(display.value);
    }catch(error){
        display.value= "ERROR";
    }

}