package com.example.kmmgitlib

import platform.UIKit.UIDevice
import platform.UIKit.UIViewController
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertAction
import platform.UIKit.UIAlertActionStyleDefault
import platform.UIKit.UIAlertControllerStyle
import platform.UIKit.UIAlertControllerStyleAlert

actual fun getToast(message: String, context: Any?) {
    val viewController = context as? UIViewController
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

    viewController?.presentViewController(alertController, animated = true, completion = null)
}
