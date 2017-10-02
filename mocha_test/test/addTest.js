var assert = require('chai').assert;
var add = require('../add');

describe('Add', function(){
    
    var result = add(5);
    
    it('should add 5 to value', function(){
        // var result = add(5);  // moved into outer scope
        assert.equal(result, 10);
    });
    
    it('should return type number', function(){
        // var result = add(5);
        assert.typeOf(result, 'number');
    });
});