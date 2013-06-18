start:
	./gradlew build
	foreman start -f Procfile-dev
