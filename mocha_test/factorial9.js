module.exports = function factorial(n) {
    // Complete this function
    if (n <= 1){
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}