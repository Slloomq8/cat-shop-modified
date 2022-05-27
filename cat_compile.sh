# script to compile all the catshop java classes
# command to run this from jenkins is
#     $WORKSPACE/cat_compile.sh

# Note: if you add new clients to catshop, you need to add them to the list
# of files to compile here

sudo chmod +x cat_defs.sh
./cat_defs.sh

# compiler configuration options
DEPRECATED=
#DEPRECATED=-Xlint:deprecation
#DEPRECATED=-Xlint:unchecked

FLAGS=
#FLAGS= -source 1.8 -Xlint:unchecked
#FLAGS= -source 1.8


echo Compile the CatShop system

javac  ${DEPRECATED} ${FLAGS} -cp "${CP_JUNIT5}" \
	src/catalogue/*.java \
	src/middle/*.java \
	src/dbAccess/*.java \
	src/orders/*.java \
	src/clients/*.java \
	src/remote/*.java \
	src/debug/*.java \
	src/clients/backDoor/*.java \
	src/clients/cashier/*.java \
	src/clients/collection/*.java \
	src/clients/customer/*.java \
	src/clients/shopDisplay/*.java \
	src/clients/warehousePick/*.java \

