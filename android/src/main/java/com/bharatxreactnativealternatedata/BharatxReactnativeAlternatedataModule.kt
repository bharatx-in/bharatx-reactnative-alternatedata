package com.bharatxreactnativealternatedata

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import tech.bharatx.alternatedata.AlternateDataManager

class BharatxReactnativeAlternatedataModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return "BharatxReactnativeAlternatedata"
  }

  @ReactMethod
  fun register() {
    AlternateDataManager.register(currentActivity!!)
  }

}
