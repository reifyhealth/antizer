(ns antizer.antd)

(def components '[Affix
                  Alert.ErrorBoundary
                  Anchor
                  Anchor.Link
                  Avatar
                  Breadcrumb
                  Breadcrumb.Item
                  Breadcrumb.Separator
                  Carousel
                  Cascader
                  Checkbox
                  Checkbox.Group
                  Col
                  Collapse
                  Collapse.Panel
                  ConfigProvider
                  DatePicker
                  DatePicker.MonthPicker
                  DatePicker.RangePicker
                  DatePicker.TimePicker
                  DatePicker.WeekPicker
                  DatePicker.YearPicker
                  Input
                  Input.Password
                  Input.Search
                  Input.TextArea
                  Layout
                  Layout.Content
                  Layout.Footer
                  Layout.Header
                  Layout.Sider
                  Mentions
                  Menu
                  Menu.Item
                  Menu.ItemGroup
                  Menu.SubMenu
                  Progress
                  Radio
                  Radio.Group
                  Row
                  Select
                  Spin
                  Statistic.Countdown
                  Steps
                  Steps.Step
                  Tabs
                  Tabs.TabPane
                  Transfer
                  Transfer.List
                  Transfer.Search
                  TreeSelect
                  Upload
                  Upload.Dragger])

(def props '[locales])

(def funcs '[message.config
             message.destroy
             message.error
             message.info
             message.loading
             message.success
             message.warn
             message.warning
             Modal.confirm
             Modal.error
             Modal.info
             Modal.success
             Modal.warning
             notification.close
             notification.config
             notification.destroy
             notification.error
             notification.info
             notification.open
             notification.success
             notification.warn
             notification.warning])

(def form-funcs '[getFieldDecorator
                  getFieldError
                  getFieldsError
                  getFieldsValue
                  getFieldValue
                  isFieldsTouched
                  isFieldTouched
                  isFieldValidating
                  resetFields
                  setFields
                  setFieldsValue
                  validateFields
                  validateFieldsAndScroll])
