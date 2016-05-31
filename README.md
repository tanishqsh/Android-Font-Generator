# Android-Font-Generator
This is a custom JAVA class which can be used to call Type-forms in-order to have efficient application. It currently supports close to 4 fonts, I'll be adding more than 40+ in the upcoming time.

# How to use?

//Calling FontGenerator Class 

FontGenerator ff = new FontGenerator(getApplicationContext()); //It takes Context as the parameter 

TextView textView = (TextView)findViewById(R.id.textView); 

Typeface myFont1 = ff.getAtelierOmega(); 

Typeface myFont2 = ff.getEarthOrbiter(); 

Typeface myFont3 = ff.getCronus(); 

Typeface myFont4 = ff.getRobotoRegular(); 

textView.setTypeface(myFont1); //Replace myFont1 with myFont2, myFont3... to get your prefered Typeface.

More Fonts will be added soon.
