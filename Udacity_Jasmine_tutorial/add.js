function add(x,y){
    var result;
    if ((typeof x && typeof y) !== 'number'){
        throw new Error('Params must be a number.');
    }
    
    result = x + y;
    if (parseInt(result) !== result){
        result = parseFloat(result.toFixed(1));
    }
    return result;
}

// Example:
// Expect add(2,3) to equal 5
expect(add(2, 3)).toBe(5);

// Example:
// Expect add() to throw an error if x/y are not numbers
expect(add(2, 'test')).toThrow();

// You try to this test:
// Expect add(0.1, 0.2) to equal 0.3
expect(add(0.1, 0.2)).toBe(0.3);


