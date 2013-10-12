(ns c2-test
  (:require [c2.core :refer [unify]]
            [c2.scale :as scale]))

(def !my-data (atom {"A" 1, "B" 2, "C" 4, "D" 3}))

(bind! "#barchart"
       [:div#barchart
        [:h2 "Rad barchart!"]
        [:div.bars
         (unify !my-data
                (fn [[label val]]
                  [:div.bar
                   [:div.bar-fill {:style {:width (x-scale val)}}]
                   [:span.label label]]))]])

