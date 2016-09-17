(ns thirdpartyjs.core)

(enable-console-print!)

(set! (.-innerHTML (.getElementById js/document "app")) "<h1>Let's do this</h1>")
