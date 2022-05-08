(ns reframe-sign-in.views
  (:require
   [re-frame.core :as re-frame]
   [reframe-sign-in.subs :as subs]
   [reframe-sign-in.events :as events]
   [reagent-password-strength-bar.core :refer [password-strength-bar]]))

(defn main-panel []
  (let [password (re-frame/subscribe [::subs/password])]
    [:div
     [:form
      "Password" [:br]
      [:input
       {:id "password"
        :name "password"
        :class "form-control"
        :placeholder "Enter password"
        :type "password"
        :value @password
        :on-change #(re-frame/dispatch [::events/change-password (-> % .-target .-value)])}]
      [password-strength-bar password]
      ]]))
