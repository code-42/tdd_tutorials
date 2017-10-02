var assert = require('chai').assert;
var first = require('../first');

describe('First', function(){
    it('should return hello world', function(){
        assert.equal(first(), 'hello world');
    });
});