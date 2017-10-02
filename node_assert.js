var assert = require('assert');

function add(a,b){
    return a+b;
}

var expected = add(1,3);

assert.equal(expected,4, 'One plus three == 4');

