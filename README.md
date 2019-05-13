# ImageView

How to use: ----


Create Image view activity and do this..

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String[] mResources = {
                "https://www.hellomagazine.com/imagenes/celebrities/2018031046891/emma-watson-spotted-with-boyfriend-chord-overstreet/0-234-768/emma-watson-t.jpg",
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2016/10/17/11/harry-potter-hermione.jpg",
                "https://i.pinimg.com/originals/cb/5a/56/cb5a5655834dd84f7c003c76c606b6f3.jpg",
                "https://blog-assets.hootsuite.com/wp-content/uploads/2016/08/social-media-for-business-940x470.jpg",
                "http://img1.wikia.nocookie.net/__cb20090317030609/harrypotter/images/e/e1/HermioneHBPHi-resPromo3.jpg",
                "https://i2-prod.dailyrecord.co.uk/incoming/article923117.ece/ALTERNATES/s615/harry-potter-premiere-image-3-719860509.jpg",
                "https://all4desktop.com/data_images/original/4227614-emma-watsons-new-hp6-normal.jpg"
        };

        View view = new ImageviewLibs(this,mResources);

        setContentView(view);
    }
}


allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.asif4483:ImageView:1.0'
	}
