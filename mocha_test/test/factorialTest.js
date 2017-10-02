var assert = require('chai').assert;
var factorial = require('../factorial9');

describe('factorial', function(){
    
    var result = factorial(4);
    // console.log(result);
    it('should return 4x3x2x1=24', function(){
        // var result = add(5);  // moved into outer scope
        assert.equal(result, 24);
    });
    
    it('should return type number', function(){
        // var result = add(5);
        assert.typeOf(result, 'number');
    });
});