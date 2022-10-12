const { writeFile } = require('fs');
const { argv } = require('yargs');// read environment variables from .env file
require('dotenv').config();// read the command line arguments passed with yargs
const environment = argv.environment;
const prod = `./src/environments/environment.prod.ts`;
const nonprod = `./src/environments/environment.ts`;
// in the process.env object thanks to dotenv
const environmentFileContent = `
export const environment = {
   TMDB_API_KEY: "${process.env.TMDB_API_KEY}"
};
`;

// write the content to the respective file
writeFile(prod, environmentFileContent, function (err) {
   if (err) {
      console.log(err);
   }   console.log(`Wrote variables to ${prod}`);
});

writeFile(nonprod, environmentFileContent, function (err) {
   if (err) {
      console.log(err);
   }   console.log(`Wrote variables to ${nonprod}`);
});
