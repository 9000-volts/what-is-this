child_process = require('child_process');
console.log("Hello y'all, welcome!");
console.log("Here's my pal perl!");
child_process.execSync("perl perlthing.pl", {stdio:[0,1,2]});
