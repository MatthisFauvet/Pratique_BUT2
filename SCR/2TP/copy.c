#include <fcntl.h>
#include <unistd.h>
#include <assert.h>

#define BLOCK_SIZE 1


int main(int argc, char *argv[])
{
	int fin,fout;
	char buf[BLOCK_SIZE];

	assert( argc == 3 );

	fin = open(argv[1],O_RDONLY);
	assert( fin >= 0 );

	fout = open(argv[2],O_CREAT|O_WRONLY|O_TRUNC,0600);
	assert( fout >= 0 );

	while(1){
		ssize_t nb_read; 
		nb_read = read(fin,buf,BLOCK_SIZE);
		if (nb_read <= 0)
			break;
		write(fout,buf,nb_read);
	}

	close(fin);
	close(fout);

	return 0;
}

