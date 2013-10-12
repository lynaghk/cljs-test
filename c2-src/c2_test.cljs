(ns c2-test
  (:require-macros [c2.util :refer [bind!]])
  (:require [c2.core :refer [unify]]
            [c2.scale :as scale]))

(def !my-data (atom {"A" 1, "B" 2, "C" 4, "D" 3}))

(def x-scale
  (scale/linear :domain [0 4] :range [0 100]))

(def x-scale-percent
  #(str (x-scale %) "%"))

(bind! "#barchart"
       [:div#barchart
        [:h2 "Rad barchart!"]
        [:table
         (unify @!my-data
                (fn [[label val]]
                  [:tr
                   [:td
                    [:span.label label]]
                   [:td.bar
                    [:div.bar-fill {:style {:width (x-scale-percent val)}}]]]))]])
