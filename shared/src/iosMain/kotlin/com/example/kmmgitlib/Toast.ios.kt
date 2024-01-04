package com.example.kmmgitlib

import platform.UIKit.UIDevice
import platform.UIKit.UIViewController
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertAction
import platform.UIKit.UIAlertActionStyleDefault
import platform.UIKit.UIAlertControllerStyle
import platform.UIKit.UIAlertControllerStyleAlert


actual fun getToast(message: String, context: Any?) {
    print("ModuleKmm: Fun getToast iOS")
    val view = context as? UIView
    val alertController = UIAlertController.alertControllerWithTitle(
        title = null,
        message = message,
        preferredStyle = UIAlertControllerStyleAlert
    )

    val okAction = UIAlertAction.actionWithTitle(
        title = "OK",
        style = UIAlertActionStyleDefault,
        handler = null
    )

    alertController.addAction(okAction)

    view?.addSubview(alertController.view)
}
