#include <stdio.h>

#define BLOCK_SIZE 1

int main(int argc, char *argv[]){
    
    FILE inputFile, outputFile;

    int size_t;

    inputFile = fopen(argv[0], "r");
    outputFile = fopen(argv[1], "w");

    if(inputFile && outputFile) {

        size_t fread(void *zone, 1024, 1024, FILE* inputFile);
        for(int i=0; i<size_t; i++){
            size_t fread(void *zone, 1024, 1024, FILE *outputFile);
        }
        fclose(flux);    
    }
  return EXIT_SUCCESS;
}