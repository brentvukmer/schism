(ns schism.test
  (:require #?(:cljs [doo.runner :refer-macros [doo-tests]])
            schism.node-test
            schism.vector-clock-test
            schism.types.set-test))

#?(:cljs (doo-tests 'schism.node-test
                    'schism.vector-clock-test
                    'schism.types.set-test))
